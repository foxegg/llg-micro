@echo off
dir
echo start git operation
copy ./index/dist/* ./
git add ./
git commit -m "post"
git push
echo 'git operation finish!'