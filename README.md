# StreamVault 🎬

![Platform](https://img.shields.io/badge/platform-Android-green.svg)
![Kotlin](https://img.shields.io/badge/kotlin-1.9.10-blue.svg)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

**StreamVault** is a premium Android streaming application featuring a custom-designed interface, advanced video player, watch history tracking, downloads, and fully customizable UI themes.

## ✨ Features

### 🎥 Advanced Video Player
- **ExoPlayer Integration** - Professional-grade video playback
- **Multi-Quality Support** - 360p, 480p, 720p, 1080p playback
- **Subtitle Support** - .srt, .vtt, .ass formats with full styling
- **Multi-Language Audio** - Switch between audio tracks seamlessly
- **Playback Controls** - Speed control (0.5x - 2.0x), seek bar, full screen
- **PiP Mode** - Picture-in-Picture for multitasking
- **Video Translation** - Built-in subtitle translation support

### 📺 Content Management
- **Home Screen** - Featured content carousel + Recently watched
- **Smart Search** - Global content search with filters
- **Watch History** - Automatic resume from last position
- **Bookmarks/Favorites** - Save your favorite content
- **Download Support** - Offline viewing with quality selection
- **Smart Recommendations** - Personalized content suggestions

### 🎨 Customization
- **Dark/Light Theme** - System-aware theme switching
- **Custom Colors** - Fully customizable primary, secondary, tertiary colors
- **Material Design 3** - Modern, beautiful UI components
- **Smooth Animations** - Polished transitions and interactions
- **Layout Options** - Grid or list view layouts

### ⚙️ Settings & Preferences
- **Theme Customization** - Color picker for interface colors
- **Playback Settings** - Default quality, subtitles, audio preferences
- **Download Management** - Storage location, auto-quality selection
- **History Management** - Clear watch history, export/import
- **Data & Cache** - Manage app storage and cache

### 🔐 Security & Privacy
- **HTTPS Support** - Secure connections by default
- **Certificate Pinning** - Protection against MITM attacks
- **Secure Storage** - Encrypted credential storage
- **Privacy Settings** - Analytics opt-in control

## 🛠 Tech Stack

| Component | Technology | Version |
|-----------|-----------|---------|
| Language | Kotlin | 1.9.10 |
| UI Framework | Jetpack Compose | 1.5.4 |
| Video Player | ExoPlayer | 2.19.1 |
| Database | Room | 2.6.1 |
| Networking | Retrofit + OkHttp | 2.10.0 |
| Dependency Injection | Hilt | 2.48 |
| Preferences | DataStore | 1.0.0 |
| Image Loading | Coil | 2.5.0 |
| Build System | Gradle | 8.0.2 |
| Min SDK | Android 7.0 (API 24) |
| Target SDK | Android 14 (API 34) |

## 📦 Installation

### Option 1: Download Pre-built APK
1. Go to [Releases](https://github.com/maiziabdenbi-lang/StreamVault/releases)
2. Download the latest `StreamVault-release.apk`
3. Install on your Android device (API 24+)

### Option 2: Build from Source

**Requirements:**
- Android Studio (Flamingo or later)
- Java 11+
- Gradle 8.0+

**Steps:**
```bash
git clone https://github.com/maiziabdenbi-lang/StreamVault.git
cd StreamVault
./gradlew assembleRelease
```

### Option 3: GitHub Actions (Automated)
1. Push to `main` branch
2. GitHub Actions builds the APK automatically
3. Download from Actions tab or Releases

## 📂 Project Structure

```
StreamVault/
├── app/
│   ├── src/main/
│   │   ├── kotlin/com/streamvault/app/
│   │   │   ├── MainActivity.kt
│   │   │   └── ui/
│   │   │       ├── theme/
│   │   │       │   ├── Theme.kt
│   │   │       │   └── Type.kt
│   │   │       ├── navigation/
│   │   │       │   └── NavGraph.kt
│   │   │       └── screens/
│   │   │           ├── HomeScreen.kt
│   │   │           ├── SearchScreen.kt
│   │   │           ├── DownloadsScreen.kt
│   │   │           └── SettingsScreen.kt
│   │   ├── res/
│   │   │   └── values/
│   │   │       └── strings.xml
│   │   └── AndroidManifest.xml
│   ├── build.gradle
│   └── proguard-rules.pro
├── build.gradle
├── settings.gradle
├── gradle.properties
└── README.md
```

## 🎯 Screens

- **Home** - Featured & Recent content
- **Search** - Find your favorite movies/shows
- **Downloads** - Manage offline content
- **Settings** - Customize themes & preferences

## 🎨 Customization

Edit `app/src/main/kotlin/com/streamvault/app/ui/theme/Theme.kt` to change colors:

```kotlin
primary = Color(0xFF7C3AED),      // Purple
secondary = Color(0xFF06B6D4),    // Cyan
tertiary = Color(0xFFEC4899),     // Pink
```

## 🚀 Build & Run

```bash
# Build debug
./gradlew assembleDebug

# Build release
./gradlew assembleRelease

# Run on device
./gradlew installDebug
```

## 📋 Roadmap

- [ ] ExoPlayer integration
- [ ] Watch history sync
- [ ] Download manager
- [ ] Cloud backups
- [ ] TV app version
- [ ] Chromecast support

## 📄 License

MIT License - See LICENSE file for details

## ⚠️ Disclaimer

StreamVault is for educational use. Users must comply with applicable laws and respect copyright.

## 📞 Support

- Issues: [GitHub Issues](https://github.com/maiziabdenbi-lang/StreamVault/issues)
- Discussions: [GitHub Discussions](https://github.com/maiziabdenbi-lang/StreamVault/discussions)

---

**StreamVault** - Your Premium Streaming Experience ✨

Made with ❤️ by [@maiziabdenbi-lang](https://github.com/maiziabdenbi-lang)