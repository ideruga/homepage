# (c) Igor Deruga
FROM tomcat:8

RUN rm -rf $CATALINA_HOME/webapps/*

ADD ./build/libs/homepage.war $CATALINA_HOME/webapps/ROOT.war

# This environment option is added due to the tomcat halting on a webapp deployment. 
# For more details, see https://serverfault.com/a/655638/426051
ENV JAVA_OPTS "-Djava.security.egd=file:/dev/./urandom"

CMD ["catalina.sh", "run"]