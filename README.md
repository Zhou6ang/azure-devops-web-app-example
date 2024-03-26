## Azure Web App Deployed by Azure Pipeline Example
1. Create azure portal and devops account
  - https://portal.azure.com/
  - https://dev.azure.com/
2. In Azure portal
  - create subscription
  - create resource group
  - create container registry
  - create azure web app with container
3. In Azure DevOps
  - Repos: import a project via github or azure repository
  - Pipelines: create new pipeline for project
  - Environment: create environment for project, e.g. dev, prod
  - Project setting
    - Agent pools: setup cicd via self-hosted agent or purchase Azure hosted agent. 
	- Service connections: 
	  - Docker registry: new service connection -> Docker registry or github -> Azure Container registry(created at step 2) -> service principle -> ... -> service connection name(e.g. abc)
	  - Azure resource manager: new service connection -> Azure resource manager -> Service principal(automatic) -> Subscription -> ... -> service connection name(e.g. bcd/Azure subscription 1)
  - Edit azure-pipeline.yml if needed and trigger it.
  
4. For Java 17, refer to https://github.com/Zhou6ang/springboot-ddd-example
