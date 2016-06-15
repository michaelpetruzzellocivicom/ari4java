package ch.loway.oss.ari4java.generated.ari_1_9_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Jan 30 13:39:05 CET 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * User-generated event with additional user-defined fields in the object.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class ChannelUserevent_impl_ari_1_9_0 extends Event_impl_ari_1_9_0 implements ChannelUserevent, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A bridge that is signaled with the user event.  */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_9_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

  /**  A channel that is signaled with the user event.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_9_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  A endpoint that is signaled with the user event.  */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_1_9_0.class )
 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

  /**  The name of the user event.  */
  private String eventname;
 public String getEventname() {
   return eventname;
 }

 @JsonDeserialize( as=String.class )
 public void setEventname(String val ) {
   eventname = val;
 }

  /**  Custom Userevent data  */
  private String userevent;
 public String getUserevent() {
   return userevent;
 }

 @JsonDeserialize( as=String.class )
 public void setUserevent(String val ) {
   userevent = val;
 }

/** No missing signatures from interface */
}

