FROM gradle:6.7.1-jdk11

#COPY --chown=gradle:gradle . /home/gradle/src
#COPY --chown=gradle:gradle src /home/gradle/src
#COPY --chown=gradle:gradle build.gradle /home/gradle/src
#COPY --chown=gradle:gradle settings.gradle /home/gradle/src

RUN pwd
RUN ls -la

WORKDIR /home/gradle/src

RUN pwd
RUN ls -la

#RUN gradle test