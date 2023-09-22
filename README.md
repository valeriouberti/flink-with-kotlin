# Real-time Data Processing with Apache Flink and Kotlin

## Overview

This repository contains a real-time data processing application built with Apache Flink and Kotlin. The application demonstrates how to ingest data from a Kafka topic, perform real-time data processing, and then output the processed data to another Kafka topic. It leverages the power of Apache Flink's stream processing capabilities and Kotlin's expressive syntax to create a robust and efficient data pipeline.

## Features

- Kafka as a data source and sink: The application uses Kafka as a data source to ingest streaming data and as a sink to output processed data, making it highly scalable and fault-tolerant.
- Stream processing: Apache Flink's stream processing capabilities are employed to perform operations such as keying, aggregation, and filtering on the incoming data stream.
- Kotlin advantages: The use of Kotlin provides benefits such as concise syntax, null safety, extension functions, and seamless interoperability with Java.
- Coroutines for asynchronous operations: Kotlin's coroutines are utilized for handling asynchronous tasks, ensuring efficient processing of data streams.

## Getting Started

To run the application locally, follow these steps:

### Prerequisites

- Apache Flink installed and configured.
- Kafka broker running locally with topics set up as specified in the application code.
- Kotlin and the required dependencies installed.

### Installation

1. Clone this repository:
   ```bash
   git clone <repository-url>
   ```
2.  Navigate to the project directory
   ```bash 
   cd flink-with-kotlin
   ```
3. Build the project using Maven
   ```bash
   mvn clean package
   ```
The application will start processing data from the Kafka source, perform stream processing tasks, and send the processed data to the Kafka sink.
 
## Contributing
Contributions to this project are welcome! If you find a bug or have suggestions for improvements, please open an issue or submit a pull request.

