# DatadogLoggingService

1. Use intelliJ prefereably to work with this project
2. "mvn clean install" to buildvthe code and execute the **"datadog-0.0.1-SNAPSHOT.jar"** file present in **target/** to start the server on port: 8080


# Running Datadog-agent
1. Install agent via terminal using below command. Get the <BV_API_KEY> from Bazaarvoice Datadog integration page.
   ```
   DD_AGENT_MAJOR_VERSION=7 DD_API_KEY="<BV_API_KEY>" DD_SITE="datadoghq.com" bash -c "$(curl -L https://s3.amazonaws.com/dd-agent/scripts/install_mac_os.sh)"
   ```
   
3. Commands to start, stop and check status of the agent
    ```
    launchctl stop com.datadoghq.agent
    launchctl start com.datadoghq.agent
    datadog-agent status
    ```
        
4. Modify **~/.datadog-agent/datadog.yaml** file with DD BV_API_KEY, agent's global configurations.
5. Create a directory **/log4j.d/conf.yaml** under **~/.datadog-agent/conf.d/** to add configuration specific to our log file (app.log for this application)
6. /log4j.d/conf.yaml would look like below
   ``` 
    logs:
      - type: file
      path: /Users/sindhu.batchu/Documents/workspace-intelliJ/target/logs/errors/app.log
      service: DatadogLoggingService
      source: apache
      start_position: beginning
      auto_multi_line_detection: true
   ```
