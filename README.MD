# Sample Config Server with encrypted properties

The keystore was generated with `keytool -genkeypair -alias mytestkey -keyalg RSA -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" -keypass changeme -keystore server.jks -storepass letmein`.

The **config-server** is running on port `8888`, the **application** is on port `8080`.

If the beans defined in `ConfigServerApplication` commented out, then the decryption does not work.