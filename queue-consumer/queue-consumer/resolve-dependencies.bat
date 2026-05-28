@echo off
setlocal enabledelayedexpansion
cd /d "%~dp0"

echo ========================================
echo QueueConsumer - Dependency Resolution
echo ========================================
echo.

echo Step 1: Cleaning previous builds...
call gradlew.bat clean

echo Step 2: Downloading and caching dependencies...
call gradlew.bat build --no-build-cache

if !ERRORLEVEL! EQU 0 (
    echo.
    echo ========================================
    echo SUCCESS: Dependencies Resolved
    echo ========================================
    echo.
    echo Your ConsumerQueue.java should now compile.
    echo.
    echo Next steps:
    echo 1. In IDE: Right-click project
    echo 2. Select: Reload Gradle Project
    echo 3. Wait for IDE to refresh
    echo 4. Import errors should disappear
    echo.
) else (
    echo.
    echo ========================================
    echo FAILED: Check errors above
    echo ========================================
)

pause
pause

