package ch.loway.oss.ari4java.generated.ari_1_7_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Wed Aug 31 18:05:10 CEST 2016
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Endpoint state changed.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class EndpointStateChange_impl_ari_1_7_0 extends Event_impl_ari_1_7_0 implements EndpointStateChange, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Endpoint endpoint;
 public Endpoint getEndpoint() {
   return endpoint;
 }

 @JsonDeserialize( as=Endpoint_impl_ari_1_7_0.class )
 public void setEndpoint(Endpoint val ) {
   endpoint = val;
 }

/** No missing signatures from interface */
}

