# Selenium Automation Template

Enterprise-style Selenium Java template designed for Automation Architect / Senior Automation Engineer discussions.

## Architecture
- ThreadLocal `DriverManager` for parallel isolation
- `DriverFactory` for local/Grid execution
- Immutable environment configuration
- Explicit-wait `ElementActions`
- Page Object + component + workflow/facade layers
- REST Assured service-client example
- Isolated test-data factory
- Execution IDs + failure screenshot evidence
- TestNG smoke/regression/parallel suites
- Jenkins pipeline + Docker Selenium Grid

## Prerequisites
- Java 17+
- Maven 3.9+
- Chrome/Firefox for local UI runs, or Docker for Grid

Selenium Manager automatically resolves supported browser drivers for local execution.

## Run API smoke only
`mvn test -Pqa -DsuiteXmlFile=src/test/resources/suites/smoke.xml -Dgroups=api`

## Run smoke locally (headless Chrome)
`mvn test -Pqa -Dbrowser=chrome -Dheadless=true -DsuiteXmlFile=src/test/resources/suites/smoke.xml`

## Run regression
`mvn test -Pqa -Dbrowser=chrome -Dheadless=true -DsuiteXmlFile=src/test/resources/suites/regression.xml`

## Run parallel suite
`mvn test -Pqa -Dbrowser=chrome -Dheadless=true -DsuiteXmlFile=src/test/resources/suites/parallel.xml`

## Run on Selenium Grid
1. `docker compose up -d`
2. `mvn test -Pqa -Dexecution=grid -DgridUrl=http://localhost:4444/wd/hub -Dbrowser=chrome -DsuiteXmlFile=src/test/resources/suites/smoke.xml`

## Demo application
UI examples use `https://the-internet.herokuapp.com/login`; API example uses JSONPlaceholder. These are public demo endpoints and can change independently of this template.

## Design principle
Keep the shared core stable and business-agnostic. Product-specific pages, workflows, and test data stay outside the core. Add specialized capabilities through extensions rather than turning the core into a giant framework.
