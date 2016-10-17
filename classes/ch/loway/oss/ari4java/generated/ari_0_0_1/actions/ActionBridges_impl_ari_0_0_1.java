package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

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
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

/**********************************************************
 * 
 * Generated by: Apis
 *********************************************************/


public class ActionBridges_impl_ari_0_0_1 extends BaseAriAction  implements ActionBridges {
/**********************************************************
 * Active bridges
 * 
 * List all active bridges in Asterisk.
 *********************************************************/
private void buildList() {
reset();
url = "/bridges";
method = "GET";
}

@Override
public List<Bridge> list() throws RestException {
buildList();
String json = httpActionSync();
return deserializeJsonAsAbstractList( json,
   new TypeReference<List<Bridge_impl_ari_0_0_1>>() {} ); 
}

@Override
public void list(AriCallback<List<Bridge>> callback) {
buildList();
httpActionAsync(callback, new TypeReference<List<Bridge_impl_ari_0_0_1>>() {});
}

/**********************************************************
 * Active bridges
 * 
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 *********************************************************/
private void buildCreate(String type) {
reset();
url = "/bridges";
method = "POST";
lParamQuery.add( HttpParam.build( "type", type) );
}

@Override
public Bridge create(String type) throws RestException {
buildCreate(type);
String json = httpActionSync();
return deserializeJson( json, Bridge_impl_ari_0_0_1.class ); 
}

@Override
public void create(String type, AriCallback<Bridge> callback) {
buildCreate(type);
httpActionAsync(callback, Bridge_impl_ari_0_0_1.class);
}

/**********************************************************
 * Individual bridge
 * 
 * Get bridge details.
 *********************************************************/
private void buildGet(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "GET";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public Bridge get(String bridgeId) throws RestException {
buildGet(bridgeId);
String json = httpActionSync();
return deserializeJson( json, Bridge_impl_ari_0_0_1.class ); 
}

@Override
public void get(String bridgeId, AriCallback<Bridge> callback) {
buildGet(bridgeId);
httpActionAsync(callback, Bridge_impl_ari_0_0_1.class);
}

/**********************************************************
 * Individual bridge
 * 
 * Shut down a bridge.
 * If any channels are in this bridge, they will be removed and resume whatever they were doing beforehand.
 *********************************************************/
private void buildDestroy(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
}

@Override
public void destroy(String bridgeId) throws RestException {
buildDestroy(bridgeId);
String json = httpActionSync();
}

@Override
public void destroy(String bridgeId, AriCallback<Void> callback) {
buildDestroy(bridgeId);
httpActionAsync(callback);
}

/**********************************************************
 * Add a channel to a bridge
 * 
 * Add a channel to a bridge.
 *********************************************************/
private void buildAddChannel(String bridgeId, String channel, String role) {
reset();
url = "/bridges/" + bridgeId + "/addChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lParamQuery.add( HttpParam.build( "role", role) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
lE.add( HttpResponse.build( 422, "Channel not in Stasis application") );
}

@Override
public void addChannel(String bridgeId, String channel, String role) throws RestException {
buildAddChannel(bridgeId, channel, role);
String json = httpActionSync();
}

@Override
public void addChannel(String bridgeId, String channel, String role, AriCallback<Void> callback) {
buildAddChannel(bridgeId, channel, role);
httpActionAsync(callback);
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Play music on hold to a bridge or change the MOH class that is playing.
 *********************************************************/
private void buildStartMoh(String bridgeId, String mohClass) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "POST";
lParamQuery.add( HttpParam.build( "mohClass", mohClass) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public void startMoh(String bridgeId, String mohClass) throws RestException {
buildStartMoh(bridgeId, mohClass);
String json = httpActionSync();
}

@Override
public void startMoh(String bridgeId, String mohClass, AriCallback<Void> callback) {
buildStartMoh(bridgeId, mohClass);
httpActionAsync(callback);
}

/**********************************************************
 * Play music on hold to a bridge
 * 
 * Stop playing music on hold to a bridge.
 * This will only stop music on hold being played via POST bridges/{bridgeId}/moh.
 *********************************************************/
private void buildStopMoh(String bridgeId) {
reset();
url = "/bridges/" + bridgeId + "/moh";
method = "DELETE";
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
}

@Override
public void stopMoh(String bridgeId) throws RestException {
buildStopMoh(bridgeId);
String json = httpActionSync();
}

@Override
public void stopMoh(String bridgeId, AriCallback<Void> callback) {
buildStopMoh(bridgeId);
httpActionAsync(callback);
}

/**********************************************************
 * Play media to the participants of a bridge
 * 
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 *********************************************************/
private void buildPlay(String bridgeId, String media, String lang, int offsetms, int skipms) {
reset();
url = "/bridges/" + bridgeId + "/play";
method = "POST";
lParamQuery.add( HttpParam.build( "media", media) );
lParamQuery.add( HttpParam.build( "lang", lang) );
lParamQuery.add( HttpParam.build( "offsetms", offsetms) );
lParamQuery.add( HttpParam.build( "skipms", skipms) );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in a Stasis application") );
}

@Override
public Playback play(String bridgeId, String media, String lang, int offsetms, int skipms) throws RestException {
buildPlay(bridgeId, media, lang, offsetms, skipms);
String json = httpActionSync();
return deserializeJson( json, Playback_impl_ari_0_0_1.class ); 
}

@Override
public void play(String bridgeId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback) {
buildPlay(bridgeId, media, lang, offsetms, skipms);
httpActionAsync(callback, Playback_impl_ari_0_0_1.class);
}

/**********************************************************
 * Record audio on a bridge
 * 
 * Start a recording.
 * This records the mixed audio from all channels participating in this bridge.
 *********************************************************/
private void buildRecord(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) {
reset();
url = "/bridges/" + bridgeId + "/record";
method = "POST";
lParamQuery.add( HttpParam.build( "name", name) );
lParamQuery.add( HttpParam.build( "format", format) );
lParamQuery.add( HttpParam.build( "maxDurationSeconds", maxDurationSeconds) );
lParamQuery.add( HttpParam.build( "maxSilenceSeconds", maxSilenceSeconds) );
lParamQuery.add( HttpParam.build( "ifExists", ifExists) );
lParamQuery.add( HttpParam.build( "beep", beep) );
lParamQuery.add( HttpParam.build( "terminateOn", terminateOn) );
lE.add( HttpResponse.build( 400, "Invalid parameters") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge is not in a Stasis application; A recording with the same name already exists on the system and can not be overwritten because it is in progress or ifExists=fail") );
lE.add( HttpResponse.build( 422, "The format specified is unknown on this system") );
}

@Override
public LiveRecording record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn) throws RestException {
buildRecord(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
String json = httpActionSync();
return deserializeJson( json, LiveRecording_impl_ari_0_0_1.class ); 
}

@Override
public void record(String bridgeId, String name, String format, int maxDurationSeconds, int maxSilenceSeconds, String ifExists, boolean beep, String terminateOn, AriCallback<LiveRecording> callback) {
buildRecord(bridgeId, name, format, maxDurationSeconds, maxSilenceSeconds, ifExists, beep, terminateOn);
httpActionAsync(callback, LiveRecording_impl_ari_0_0_1.class);
}

/**********************************************************
 * Remove a channel from a bridge
 * 
 * Remove a channel from a bridge.
 *********************************************************/
private void buildRemoveChannel(String bridgeId, String channel) {
reset();
url = "/bridges/" + bridgeId + "/removeChannel";
method = "POST";
lParamQuery.add( HttpParam.build( "channel", channel) );
lE.add( HttpResponse.build( 400, "Channel not found") );
lE.add( HttpResponse.build( 404, "Bridge not found") );
lE.add( HttpResponse.build( 409, "Bridge not in Stasis application") );
lE.add( HttpResponse.build( 422, "Channel not in this bridge") );
}

@Override
public void removeChannel(String bridgeId, String channel) throws RestException {
buildRemoveChannel(bridgeId, channel);
String json = httpActionSync();
}

@Override
public void removeChannel(String bridgeId, String channel, AriCallback<Void> callback) {
buildRemoveChannel(bridgeId, channel);
httpActionAsync(callback);
}

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void create(String type, String bridgeId, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_7_0
 *********************************************************/
public void createWithId(String type, String bridgeId, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void playWithId(String bridgeId, String playbackId, String media, String lang, int offsetms, int skipms, AriCallback<Playback> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_7_0
 *********************************************************/
public Bridge createWithId(String type, String bridgeId, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Bridge create(String type, String bridgeId, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_0_0
 *********************************************************/
public Bridge create(String type, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_0_0
 *********************************************************/
public void create(String type, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound:, recording:, number:, digits:, characters:, and tone: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback play(String bridgeId, String media, String lang, int offsetms, int skipms, String playbackId) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Start playback of media on a bridge.
 * The media URI may be any of a number of URI's. Currently sound: and recording: URI's are supported. This operation creates a playback resource that can be used to control the playback of media (pause, rewind, fast forward, etc.)
 * 
 * @since ari_1_5_0
 *********************************************************/
public Playback playWithId(String bridgeId, String playbackId, String media, String lang, int offsetms, int skipms) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void play(String bridgeId, String media, String lang, int offsetms, int skipms, String playbackId, AriCallback<Playback> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void create_or_update_with_id(String type, String bridgeId, String name, AriCallback<Bridge> callback){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * Create a new bridge or updates an existing one.
 * This bridge persists until it has been shut down, or Asterisk has been shut down.
 * 
 * @since ari_1_5_0
 *********************************************************/
public Bridge create_or_update_with_id(String type, String bridgeId, String name) throws RestException{
  throw new UnsupportedOperationException("Method availble from ...");
};

};

