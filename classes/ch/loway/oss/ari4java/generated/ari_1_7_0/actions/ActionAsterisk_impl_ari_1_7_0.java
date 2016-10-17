package ch.loway.oss.ari4java.generated.ari_1_7_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 31 18:05:11 CEST 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.HttpParam;
import ch.loway.oss.ari4java.tools.HttpResponse;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_7_0.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionAsterisk_impl_ari_1_7_0 extends BaseAriAction  implements ActionAsterisk {
/**********************************************************
 * Asterisk system information (similar to core show settings)
 * 
 * Gets Asterisk system information.
 *********************************************************/
private void buildGetInfo(String only) {
reset();
url = "/asterisk/info";
method = "GET";
lParamQuery.add( HttpParam.build( "only", only) );
}

@Override
public AsteriskInfo getInfo(String only) throws RestException {
buildGetInfo(only);
String json = httpActionSync();
return deserializeJson( json, AsteriskInfo_impl_ari_1_7_0.class ); 
}

@Override
public void getInfo(String only, AriCallback<AsteriskInfo> callback) {
buildGetInfo(only);
httpActionAsync(callback, AsteriskInfo_impl_ari_1_7_0.class);
}

/**********************************************************
 * Global variables
 * 
 * Get the value of a global variable.
 *********************************************************/
private void buildGetGlobalVar(String variable) {
reset();
url = "/asterisk/variable";
method = "GET";
lParamQuery.add( HttpParam.build( "variable", variable) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public Variable getGlobalVar(String variable) throws RestException {
buildGetGlobalVar(variable);
String json = httpActionSync();
return deserializeJson( json, Variable_impl_ari_1_7_0.class ); 
}

@Override
public void getGlobalVar(String variable, AriCallback<Variable> callback) {
buildGetGlobalVar(variable);
httpActionAsync(callback, Variable_impl_ari_1_7_0.class);
}

/**********************************************************
 * Global variables
 * 
 * Set the value of a global variable.
 *********************************************************/
private void buildSetGlobalVar(String variable, String value) {
reset();
url = "/asterisk/variable";
method = "POST";
lParamQuery.add( HttpParam.build( "variable", variable) );
lParamQuery.add( HttpParam.build( "value", value) );
lE.add( HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public void setGlobalVar(String variable, String value) throws RestException {
buildSetGlobalVar(variable, value);
String json = httpActionSync();
}

@Override
public void setGlobalVar(String variable, String value, AriCallback<Void> callback) {
buildSetGlobalVar(variable, value);
httpActionAsync(callback);
}

/**********************************************************
 * Reload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void reloadModule(String moduleName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create or update a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<ConfigTuple> updateObject(String configClass, String objectType, String id, Map<String,String> fields) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void deleteObject(String configClass, String objectType, String id, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void reloadModule(String moduleName, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void addLog(String logChannelName, String configuration, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void unloadModule(String moduleName, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * List Asterisk modules.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<Module> listModules() throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Gets Asterisk log channel information.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public List<LogChannel> listLogChannels() throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Get Asterisk module information.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public Module getModule(String moduleName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void rotateLog(String logChannelName, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Retrieve a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public List<ConfigTuple> getObject(String configClass, String objectType, String id) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Load an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void loadModule(String moduleName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Unload an Asterisk module.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void unloadModule(String moduleName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void getModule(String moduleName, AriCallback<Module> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void updateObject(String configClass, String objectType, String id, Map<String,String> fields, AriCallback<List<ConfigTuple>> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Delete a dynamic configuration object.
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void deleteObject(String configClass, String objectType, String id) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Rotates a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void rotateLog(String logChannelName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void listLogChannels(AriCallback<List<LogChannel>> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Adds a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void addLog(String logChannelName, String configuration) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void listModules(AriCallback<List<Module>> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Deletes a log channel.
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void deleteLog(String logChannelName) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_9_0
 *********************************************************/
public void deleteLog(String logChannelName, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void loadModule(String moduleName, AriCallback<Void> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_8_0
 *********************************************************/
public void getObject(String configClass, String objectType, String id, AriCallback<List<ConfigTuple>> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

};

