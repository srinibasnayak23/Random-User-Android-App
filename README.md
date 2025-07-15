# 📱 Random User Android App

This is a simple Android application built using Kotlin that fetches and displays random user data using the [Random User API](https://randomuser.me/). It demonstrates modern Android development practices, including Retrofit for networking, Coroutines for asynchronous operations, and Glide for image loading.


## 🚀 Features

- Fetch a random user on button click
- Display:
  - Full Name
  - Gender
  - Email
  - Phone number
  - Profile picture
- Clean and responsive UI using **ViewBinding**
- Error handling with logs


---

## 🛠️ Built With

- **Kotlin**
- **Retrofit2** - For making HTTP requests
- **Glide** - For image loading
- **Kotlin Coroutines** - For asynchronous tasks
- **ViewBinding** - For binding views without `findViewById`

---

## 🧱 Project Structure

com.example.randomUser

├── MainActivity.kt

├── RetrofitClient.kt

├── model/

│ ├── UserResponse.kt

│ ├── Name.kt

│ └── Picture.kt

├── res/

│ ├── layout/

│ │ └── activity_main.xml

│ └── drawable/

│ └── ic_launcher.png



---

## 📦 Getting Started

### Prerequisites

- Android Studio Electric Eel or newer
- Minimum SDK: 21

### Clone the Repository


git clone https://github.com/srinibasnayak23/Random-User-Android-App.git

cd random-user-android

Run the App
Open the project in Android Studio

Build and run on an emulator or physical device



🔗 API Reference
This app uses https://randomuser.me/api to fetch random user data in JSON format.



