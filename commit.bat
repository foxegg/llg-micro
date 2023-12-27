@echo off
dir
echo start git operation
xcopy .\docs\public\ .\ /s /e /y
git add ./
git commit -m "post"
git push
echo 'git operation finish!'