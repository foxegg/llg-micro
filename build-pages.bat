@echo off
dir
echo start git operation
cd indexs
npm run pl:build
cd ../
echo 'git operation finish!'