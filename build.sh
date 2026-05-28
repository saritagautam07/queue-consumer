#!/bin/bash
# Script to refresh Gradle dependencies and build the project

echo "[*] Refreshing Gradle dependencies..."
./gradlew --refresh-dependencies

echo ""
echo "[*] Running clean build..."
./gradlew clean build

echo ""
if [ $? -eq 0 ]; then
    echo "[SUCCESS] Build completed successfully!"
    echo ""
    echo "Next steps:"
    echo "1. Refresh IDE: Right-click project -> Reload Gradle Project"
    echo "2. Update local.settings.json with your Service Bus connection string"
    echo "3. Delete old consumer-queue.java file if still present"
else
    echo "[ERROR] Build failed. Check output above for errors."
fi

