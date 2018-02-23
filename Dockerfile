FROM airhacks/wildfly
COPY ./target/tutorial-gojava.war ${DEPLOYMENT_DIR}
