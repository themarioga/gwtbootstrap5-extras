#!/bin/bash
set -ev
if [ "$TRAVIS_JDK_VERSION" == "oraclejdk8" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then

if [[ -z "$GH_TOKEN" ]]; then
echo -e "GH_TOKEN is not set"
exit 1
fi	
			
echo -e "Publishing javadoc to gh-pages . . .\n"

cp -R -v ./target/apidocs  $HOME/javadoc-latest

git config --global user.email "travis@travis-ci.org"
git config --global user.name "travis-ci"

# clone the gh-pages branch.
cd $HOME
rm -rf gh-pages
git clone --quiet --branch=gh-pages https://$GH_TOKEN@github.com/gwtbootstrap5/gwtbootstrap5-demo gh-pages > /dev/null
cd gh-pages

# remove the javadoc directories from git.
if [[ -d ./snapshot/extras-apidocs ]]; then
git rm -rf ./snapshot/extras-apidocs
fi

# copy the new javadoc to snapshot dir.
cp -Rf $HOME/javadoc-latest ./snapshot/extras-apidocs

git add -f .
git commit -m "Auto-push javadoc to gh-pages successful. (Travis build: $TRAVIS_BUILD_NUMBER)"
git push -fq origin gh-pages

echo -e "Published javadoc to gh-pages.\n"
	
fi
