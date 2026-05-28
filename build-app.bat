@echo off
cd /d "%~dp0"
echo Building QueueConsumer Function App...
echo.
call gradlew.bat clean build
if %ERRORLEVEL% EQU 0 (
    echo.
    echo BUILD SUCCESSFUL
    echo Your function app is ready to deploy.
) else (
    echo.
    echo BUILD FAILED - Check errors above
)
pause

