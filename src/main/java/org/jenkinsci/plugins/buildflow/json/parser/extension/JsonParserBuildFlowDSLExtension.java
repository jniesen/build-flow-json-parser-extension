package org.jenkinsci.plugins.buildflow.json.parser.extension;

import com.cloudbees.plugins.flow.BuildFlowDSLExtension;
import com.cloudbees.plugins.flow.FlowDelegate;
import hudson.Extension;

/**
 * Created by jniesen on 4/4/14.
 */

@Extension
public class JsonParserBuildFlowDSLExtension extends BuildFlowDSLExtension {

    public static final String EXTENSION_NAME = "build-flow-json-parser-extension";

    @Override
    public Object createExtension(String extensionName, FlowDelegate flowDelegate) {
        if(EXTENSION_NAME.equals(extensionName)) {
            return new JsonParserBuildFlowDSL(flowDelegate);
        }

        return null;
    }
}
