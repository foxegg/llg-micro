@echo off
dir
echo start git operation
xcopy .\index\dist\ .\ /s /e /y
git add ./
git commit -m "post"
git push
echo 'git operation finish!'