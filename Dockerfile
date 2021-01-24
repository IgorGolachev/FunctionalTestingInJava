FROM gradle:6.7.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src
