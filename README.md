# Namma Platform V2 (ನಮ್ಮ ಪ್ಲಾಟ್‌ಫಾರ್ಮ್)

A high-performance, bilingual Android application designed to provide real-time Indian Railway station information, train tracking, and coach positions with a specialized focus on regional language support (Kannada).

## 🚀 Features

- **Live Station Dashboard:** Real-time view of upcoming trains at selected stations.
- **Dynamic Coach Composition:** Visual maps for train coaches including Engine, General, Sleeper, AC, Ladies, and Pantry.
- **Bilingual Support:** Fully integrated **Kannada (ಕನ್ನಡ)** and English interface using Noto Sans Kannada and Baloo Bhai 2 fonts.
- **"Sahaya Madi" (Voice Assistance):** Interactive assistance feature to help users navigate railway information easily via voice.
- **Interactive Search:** Advanced search between stations with availability status (Available, Waiting List, Full).
- **Modern UI/UX:** A clean, dark-themed dashboard built using a hybrid approach (Kotlin + Optimized Assets).

## 🛠️ Tech Stack

- **Frontend:** HTML5, CSS3 (Flexbox/Grid), JavaScript (ES6+).
- **Backend/Logic:** Kotlin (Android).
- **UI Components:** Material Design 3, WebView Integration.
- **Fonts:** Noto Sans Kannada, Baloo Bhai 2.
- **Minimum SDK:** API 21+ (Android 5.0+).

## 📂 Project Structure

- `app/src/main/assets/namma_platform_v2.html`: The core dynamic dashboard and UI logic.
- `app/src/main/java/`: Kotlin source code for Android lifecycle and hardware interaction.
- `app/src/main/res/`: App icons, launch screens, and theme definitions.

## ⚙️ Installation & Setup

1. **Clone the repository:**
   bash git clone https://github.com/adityabapat0/Namma_Platform_v2.git

2. **Open in Android Studio:**
   - Go to `File > Open` and select the `NammaPlatform2` folder.

3. **Sync Gradle:**
   - Wait for the project to sync dependencies (androidx.core, appcompat, material, etc.).

4. **Run the App:**
   - Select your emulator or physical device and click the **Run** (green play) button.

## 🛠️ Development Details

The project utilizes a `WebView` based architecture to render a high-fidelity dashboard (`namma_platform_v2.html`). This allows for:
- Smooth animations and transitions.
- High-quality rendering of complex Kannada script.
- Responsive design that fits any Android screen size.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---
**Developed for the community.**  
*Empowering rail travelers through technology.*
