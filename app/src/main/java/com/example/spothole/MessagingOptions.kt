package com.example.spothole

// Solace PubSub+ Broker Options

// Fill in your Solace Cloud PubSub+ Broker's 'MQTT Host' and 'Password' options.
// This information can be found under:
// https://console.solace.cloud/services/ -> <your-service> -> 'Connect' -> 'MQTT'
const val SOLACE_CLIENT_USER_NAME = "solace-cloud-client"
const val SOLACE_CLIENT_PASSWORD = "aqlb10ethabetiu0et7ihk78ra"
const val SOLACE_MQTT_HOST = "ssl://mr-connection-5po346rfqc8.messaging.solace.cloud:8883"

// Other options
const val SOLACE_CONNECTION_TIMEOUT = 3
const val SOLACE_CONNECTION_KEEP_ALIVE_INTERVAL = 60
const val SOLACE_CONNECTION_CLEAN_SESSION = true
const val SOLACE_CONNECTION_RECONNECT = true