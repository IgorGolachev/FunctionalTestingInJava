FROM gradle:6.8.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

ENV REMOTE=true
RUN echo $REMOTE

WORKDIR /home/gradle/src