/*
 *    Copyright 2013 APPNEXUS INC
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.appnexus.opensdk;

/**
 * Used for mock responses
 */
public class TestUTResponses {

    // impbus response
    private static final String UT_NO_BID_RESPONSE = "{\"version\":\"0.0.2\",\"tags\":[{\"auction_id\":9055535852024653375,\"nobid\":1,\"tag_id\":2140063,\"uuid\":null}]}";
    private static final String UT_RTB_RESPONSE = "{\"version\":\"0.0.2\",\"tags\":[{\"uuid\":\"null\",\"auction_id\":\"5049928823070184480\",\"ut_url\":\"\",\"tag_id\":5778861,\"ads\":[{\"content_source\":\"rtb\",\"ad_type\":\"video\",\"buyer_member_id\":3535,\"creative_id\":37357778,\"media_type_id\":4,\"media_subtype_id\":64,\"notify_url\":\"\",\"rtb\":{\"video\":{\"player_width\":0,\"duration_ms\":142000,\"playback_methods\":[\"auto_play_sound_off\"],\"frameworks\":[],\"content\":\"%s\"}}}]}]}";
    private static final String UT_SSM_RESPONSE = "{\"version\":\"0.0.2\",\"tags\":[{\"uuid\":\"null\",\"auction_id\":\"4005765276550092434\",\"ut_url\":\"\",\"tag_id\":2140061,\"no_ad_url\":\"\",\"ads\":[{\"content_source\":\"ssm\",\"ad_type\":\"video\",\"buyer_member_id\":229,\"creative_id\":10124375,\"media_type_id\":1,\"media_subtype_id\":1,\"notify_url\":\"\",\"ssm\":{\"video\":{},\"timeout_ms\":500,\"handler\":[{\"url\":\"http://rlissack.adnxs.net:8080/jtest/prebidhtml.html\"}],\"trackers\":[{\"impression_urls\":[\"http://other.tracker.com\",\"http://other.tracker.com\"]}],\"request_url\":\"http://other.tracker.com\",\"response_url\":\"http://other.tracker.com\"}}]}]}";
    private static final String UT_SSM_HTML_RESPONSE = "{\"version\":\"0.0.2\",\"tags\":[{\"uuid\":\"null\",\"auction_id\":\"4005765276550092434\",\"ut_url\":\"%s\",\"tag_id\":2140061,\"no_ad_url\": \"\",\"ads\":[{\"content_source\":\"ssm\",\"ad_type\":\"banner\",\"buyer_member_id\":229,\"creative_id\":10124375,\"media_type_id\":1,\"media_subtype_id\":1,\"notify_url\":\"%s\",\"ssm\":{\"banner\":{\"width\":320,\"height\":854},\"timeout_ms\":500,\"handler\":[{\"url\":\"http://rlissack.adnxs.net:8080/jtest/prebidhtml.html\"}],\"trackers\":[{\"impression_urls\":[\"http://other.tracker.com\",\"http://other.tracker.com\"]}],\"request_url\":\"http://other.tracker.com\",\"response_url\":\"http://other.tracker.com\"}}]}]}";
    private static final String UT_HTML_RESPONSE = "{\"version\":\"0.0.2\",\"tags\":[{\"uuid\":\"null\",\"auction_id\":\"5049928823070184480\",\"ut_url\":\"\",\"tag_id\":5778861,\"ads\":[{\"content_source\":\"rtb\",\"ad_type\":\"banner\",\"buyer_member_id\":229,\"creative_id\":10124375,\"media_type_id\":1,\"media_subtype_id\":1,\"notify_url\":\"\",\"rtb\":{\"banner\":{\"width\":320,\"height\":480,\"content\":\"%s\"}}}]}]}";
    private static final String HTML_RESPONSE = "<html><body>hello!!</body></html>";
    private static final String VAST_XML_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><VAST version=\"2.0\"><Ad id=\"37357778\"><Wrapper><AdSystem version=\"2.0\">adnxs</AdSystem><VASTAdTagURI><![CDATA[http://oasc18.247realmedia.com]]></VASTAdTagURI><Error><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqgASotCXAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGY]]></Error><Impression id=\"adnxs\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCE]]></Impression><Creatives><Creative id=\"9408\"><Linear><TrackingEvents><Tracking event=\"start\"><![CDATA[http://nym1.ib.adnxs.com/vast_track]]></Tracking><Tracking event=\"firstQuartile\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCEwIAAAIA1gAFCNmV6rEFEKCo68Ck8LyKRhjwpr3Ju4qAuhEgASotCXsUrkfheoQ_EXsUrkfheoQ_GQAAAAAAAPA_IRESACkRCagwrdvgAjjPG0DPG0gCSmdfVF9aQVFBQUFBQUFBUEFfNEFFQTlRRUFBQUFBbUFLS2lNeUVEZy4umgIdIWxRYXNQZ2piLqgA8Hcyb1l6SUFRLtgCAOACpKsrgAMAiAMBkAMAmAMXoAMBqgMAsAMAuAMAwAOQHMgDANIDKAgAEiRhNjVjMTExYy1kMjI4LTQ2OTctODAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGYBAA.&event=5&s=09b6f53d34cc1ac313608a19d6920de34f1140f8]]></Tracking><Tracking event=\"midpoint\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCEwIAAAIA1gAFCNmV6rEFEKCo68Ck8LyKRhjwpr3Ju4qAuhEgASotCXsUrkfheoQ_EXsUrkfheoQ_GQAAAAAAAPA_IRESACkRCagwrdvgAjjPG0DPG0gCUNKR6BFY2oYzYABo5MMBeLTQAoABAYoBA1VTRJIBAQbwUpgBwAKgAeADqAEBsAEAuAEAwAEDyAEA0AEA2AEA4AEA8AEAigI6dWYoJ2EnLCA2NTI4ODcsIDE0NDY2NzcyMDkpO3VmKCdyJywgMzczNTc3NzgsMh4A8LSSAqUBIU5pZk8td2piMDU0RkVOS1I2QkVZQUNEYWhqTXdBRGdBUUFSSXp4dFFyZHZnBHMgDANIDKAgAEiRhNjVjMTExYy1kMjI4LTQ2OTctODAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGYBAA.&event=6&s=09b6f53d34cc1ac313608a19d6920de34f1140f8]]></Tracking><Tracking event=\"thirdQuartile\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCEwIAAAIA1gAFCNmV6rEFEKCo68Ck8LyKRhjwpr3Ju4qAuhEgASotCXsUrkfheoQ_EXsUrkfheoQ_GQAAAAAAAPA_IRESACkRCagwrdvgAjjPG0DPG0gCUNKR6BFY2oYzYABo5MMBeLTQAoABAYoBA1VTRJIBAQbwUpgBwAKgAeADqAEBsAEAuAEAwAEDyAEA0AEA2AEA4AEA8AEAigI6dWYoJ2EnLCA2NTI4ODcsIDE0NDY2NzcyMDkpO3VmKCdyJywgMzczNTc3NzgsMh4A8LSSAqUBIU5pZk8td2piMDU0RkVOS1I2QkVZQUNEYWhqTXdBRGdBUUFSSXp4dFFyZHZnQWxnQVlGaG9BSEFBZUFDQUFRQ0lBUUNRQVFHWUFRR2dBUUdvQVFPd0FRQzVBWHNVcmtmaGVvUV93UUY3Rks1SDRYcUVQOGtCX1p2clU1SmdfVF9aQVFBQUFBQUFBUEFfNEFFQTlRRUFBQUFBbUFLS2lNeUVEZy4umgIdIWxRYXNQZ2piLqgA8Hcyb1l6SUFRLtgCAOACpKsrgAMAiAMBkAMAmAMXoAMBqgMAsAMAuAMAwAOQHMgDANIDKAgAEiRhNjVjMTExYy1kMjI4LTQ2OTctODAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGYBAA.&event=7&s=09b6f53d34cc1ac313608a19d6920de34f1140f8]]></Tracking><Tracking event=\"complete\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCEwIAAAIA1gAFCNmV6rEFEKCo68Ck8LyKRhjwpr3Ju4qAuhEgASotCXsUrkfheoQ_EXsUrkfheoQ_GQAAAAAAAPA_IRESACkRCagwrdvgAjjPG0DPG0gCUNKR6BFY2oYzYABo5MM6SUFRLtgCAOACpKsrgAMAiAMBkAMAmAMXoAMBqgMAsAMAuAMAwAOQHMgDANIDKAgAEiRhNjVjMTExYy1kMjI4LTQ2OTctODAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGYBAA.&event=8&s=09b6f53d34cc1ac313608a19d6920de34f1140f8]]></Tracking></TrackingEvents><VideoClicks><ClickTracking id=\"adnxs\"><![CDATA[http://nym1.ib.adnxs.com/click?exSuR-F6hD97FK5H4XqEPwAAAAAAAPA_exSuR-F6hD97FK5H4XqEPyDUGkiC8xRGcFMvuVMAdBHZijpWAAAAAK0tWADPDQAAzw0AA/]]></ClickTracking></VideoClicks></Linear></Creative></Creatives></Wrapper></Ad></VAST>";
    private static final String VAST_XML = "<?xml version=\\\"1.0\\\" encoding=\\\"UTF-8\\\" standalone=\\\"yes\\\"?><VAST version=\\\"2.0\\\"><Ad id=\\\"37357778\\\"><Wrapper><AdSystem version=\\\"2.0\\\">adnxs</AdSystem><VASTAdTagURI><![CDATA[http://oasc18.247realmedia.com]]></VASTAdTagURI><Error><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqgASotCXAxZC0wYTMyODI1OGEwYzbYAwDgAwDoAwDwAwD4AwCABACSBAYvdXQvdjGY]]></Error><Impression id=\\\"adnxs\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPBCE]]></Impression><Creatives><Creative id=\\\"9408\\\"><Linear><TrackingEvents><Tracking event=\\\"start\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track]]></Tracking><Tracking event=\\\"firstQuartile\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3]]></Tracking><Tracking event=\\\"midpoint\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QKcBPB]]></Tracking><Tracking event=\\\"thirdQuartile\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wq]]></Tracking><Tracking event=\\\"complete\\\"><![CDATA[http://nym1.ib.adnxs.com/vast_track?e=wqT_3QK]]></Tracking></TrackingEvents><VideoClicks><ClickTracking id=\\\"adnxs\\\"><![CDATA[http://nym1.ib.adnxs.com/click?exSuR-F6hD97FK5H4XqEPw]]></ClickTracking></VideoClicks></Linear></Creative></Creatives></Wrapper></Ad></VAST>";
    private static final String VAST_INLINE_RESPONSE = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><VAST xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"vast2.xsd\" version=\"2.0\"><Ad id=\"Customized\"><InLine><AdSystem>Open AdStream</AdSystem><AdTitle>Customized</AdTitle><Description>ad Description</Description><Impression><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ieg/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?]]></Impression><Creatives><Creative><Linear><Duration>00:01:01</Duration><TrackingEvents><Tracking event=\"start\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=start&XE]]></Tracking><Tracking event=\"midpoint\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=midpoint&XE]]></Tracking><Tracking event=\"firstQuartile\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=firstQuartile&XE]]></Tracking><Tracking event=\"thirdQuartile\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=thirdQuartile&XE]]></Tracking><Tracking event=\"complete\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=complete&XE]]></Tracking><Tracking event=\"mute\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=mute&XE]]></Tracking><Tracking event=\"pause\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=pause&XE]]></Tracking><Tracking event=\"fullscreen\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=fullscreen&XE]]></Tracking><Tracking event=\"rewind\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=rewind&XE]]></Tracking><Tracking event=\"unmute\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=unmute&XE]]></Tracking><Tracking event=\"expand\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=expand&XE]]></Tracking><Tracking event=\"collapse\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=collapse&XE]]></Tracking><Tracking event=\"acceptInvitation\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=acceptInvitation&XE]]></Tracking><Tracking event=\"close\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=close&XE]]></Tracking><Tracking event=\"resume\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=resume&XE]]></Tracking><Tracking event=\"creativeView\"><![CDATA[http://oasc18.247realmedia.com/t/video-demo.appnexus.com/outstream_1/L35/1298238887@x01/ld/L35/TJM_Imp/demo_outstream_1/creative_3_vast_x01/574e6d6d2b46574d4d3077414270354f?XE&oas_iactId=creativeView&XE]]></Tracking></TrackingEvents><VideoClicks><ClickThrough><![CDATA[http://oasc18.247realmedia.com/5c/video-demo.appnexus.com/outstream_1/L35/1298238887/x01/TJM_Imp/demo_outstream_1/creative_3_vast_x01.xml/574e6d6d2b46574d4d3077414270354f?]]></ClickThrough></VideoClicks><MediaFiles><MediaFile delivery=\"progressive\" bitrate=\"1049\" width=\"854\" height=\"480\" type=\"video/mp4\"><![CDATA[http://imagec18.247realmedia.com/0/TJM_Imp/demo_outstream_1/524D5F5641535431_creative_3_vast_x01.mp4/1446478842]]></MediaFile></MediaFiles></Linear></Creative></Creatives></InLine></Ad></VAST>";

    public static String blank() {
        return "";
    }

    public static String noBid() {
        return UT_NO_BID_RESPONSE;
    }

    public static String video(){
        return String.format(UT_RTB_RESPONSE, VAST_XML);
    }

    public static String vastInline(){
        return VAST_INLINE_RESPONSE;
    }

    public static String html(){
        return UT_HTML_RESPONSE;
    }

    public static String ssmHtml(){
        return UT_SSM_HTML_RESPONSE;
    }

    public static String htmlResponse(){
        return HTML_RESPONSE;
    }

    public static String ssmVideo(){
        return UT_SSM_RESPONSE;
    }


    public static String vastXML(){
        return VAST_XML_RESPONSE;
    }
}
