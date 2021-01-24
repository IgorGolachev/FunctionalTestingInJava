FROM gradle:6.7.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

RUN chmod +x gradlew

WORKDIR /home/gradle/src