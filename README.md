# Spothole - Detecting potholes smartly 

A simple but effective solution for detecting potholes without using AI. Only thing you have to do is to drive safely. Leave the rest to the app. This project was presented as a solution at the [uOttahack5](https://2023.uottahack.ca/) which was held from Feb 10-12 2023 at the University of Ottawa, Ottawa, Canada.

## Made With 
<div align="left">
  <div>
  <img src="https://github.com/devicons/devicon/blob/master/icons/androidstudio/android-orignal-wordmark.svg" title="Android Studio" alt="Android Studio" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/kotlin/kotlin-orignal-wordmark.svg" title="Kotlin" alt="Kotlin" width="40" height="40"/>&nbsp;
  <img src="https://github.com/devicons/devicon/blob/master/icons/kotlin/kotlin-orignal-wordmark.svg" title="Kotlin" alt="Kotlin" width="40" height="40"/>&nbsp;
  </div>
</div>

---
<p align="center">
<img src="https://user-images.githubusercontent.com/49532169/219234216-072e0434-9ffa-4c1c-8680-6219efc74c79.png" width="300" height="600" align="center">
</p>


## Inspiration
I am an International Graduate Student from India and I used to travel to my undergraduate university on a motorcycle every day. The roads leading to my university were not quite great, making them quite vulnerable to Potholes. I was nearly met with an accident once due to random potholes throughout the city. After coming to Ottawa, I could see a lot of similar potholes in different places. I wanted to do something about these deadly potholes, so my teammates and I built "Spothole".

## What it does
Spothole is an app that can detect potholes "AUTOMATICALLY" using your phone's accelerometer while driving and report them to the respective authorities without the user having to report it manually so that the users travelling to those areas are made aware about the potholes..

## How we built it
We used Android Studio to build a mobile app that utilizes the different sensors on the smartphone such as the accelerometer, GPS, and gyroscope to find out if a car has hit a pothole or not. The mobile app is connected to Solace's Event Broker to broadcast the message carrying the GPS coordinates of the potholes throughout the city that get automatically marked on Google Maps for the Authorities to fix.

## Challenges we ran into
We were new to building an Android App and hence our first challenge was to learn how to build the entire application from scratch.
The integration of Google Maps API to the android app
Reading the sensor data and making sense out of the data to build an algorithm to differentiate potholes, speed breakers and uneven roads.
Integrating Solace's Event Broker into the application
Accomplishments that we're proud of
Building the Mobile app without the knowledge of Android Studio
Learning how to use EventBrokers for different usecases
Setting up Google Maps API
What's next for Spothole
Since we were new to the tech stack, it took quite some to get started and hence we couldn't finish building an additional module that we had initially planned for our app. We will try to implement that to turn our application into a more finished product.
