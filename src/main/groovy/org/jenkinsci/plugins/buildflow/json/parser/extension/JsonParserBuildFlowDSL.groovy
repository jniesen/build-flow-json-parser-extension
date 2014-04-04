package org.jenkinsci.plugins.buildflow.json.parser.extension

import com.cloudbees.plugins.flow.FlowDelegate
import groovy.json.JsonSlurper

/**
 * Created by jniesen on 4/4/14.
 */
class JsonParserBuildFlowDSL {
    def FlowDelegate flowDelegate;
    def JsonSlurper parser = new JsonSlurper();

    def JsonParserBuildFlowDSL(FlowDelegate flowDelegate) {
        this.flowDelegate = flowDelegate;
    }

    def Object parseText(String jsonString) {
        return this.parser.parseText(jsonString);
    }
}
