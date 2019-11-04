package myapp.camunda.process;
import org.camunda.bpm.application.PostDeploy;
import org.camunda.bpm.application.ProcessApplication;

import org.camunda.bpm.application.impl.ServletProcessApplication;
import org.camunda.bpm.dmn.engine.DmnDecisionTableResult;
import org.camunda.bpm.engine.DecisionService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

@ProcessApplication("App_removethisKey")
public class App extends ServletProcessApplication {

}