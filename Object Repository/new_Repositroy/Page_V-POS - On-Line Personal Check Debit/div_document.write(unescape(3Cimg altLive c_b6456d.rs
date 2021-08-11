<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_document.write(unescape(3Cimg altLive c_b6456d</name>
   <tag></tag>
   <elementGuidId>268aea2b-2203-4cfe-bc55-ccbd06523db5</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='contentwrapper']</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>#contentwrapper</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>contentwrapper</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

	 document.write(unescape('%3Cimg alt=&quot;Live chat by BoldChat&quot; src=&quot;' + (('https:' == document.location.protocol) ? 'https:' : 'http:') + '//cbi.boldchat.com/aid/789546764707432031/bc.cbi?cbdid=4938977139570161457&quot; border=&quot;0&quot; /%3E')); 
	Application: No Convenience Fees
	v+POS
	
	
	document.write(unescape('%3Cscript language=&quot;JavaScript&quot; type=&quot;text/javascript&quot; src=&quot;https://vms.boldchat.com/aid/789546764707432031/bc.vms3/vms.js&quot;%3E%3C/script%3E'));try {  var pageViewer = _bcvm.getPageViewer(&quot;789546764707432031&quot;);  pageViewer.setParameter(&quot;ChatWindowDefID&quot;, &quot;2612119448788647120&quot;);  pageViewer.setParameter(&quot;ChatWidth&quot;, &quot;640&quot;);  pageViewer.setParameter(&quot;ChatHeight&quot;, &quot;480&quot;);  pageViewer.setParameter(&quot;InvitationDefID&quot;, &quot;3361173254158732187&quot;);  pageViewer.setParameter(&quot;WindowScheme&quot;, &quot;https&quot;);  pageViewer.pageViewed();} catch(error) {}&lt;a href=&quot;http://www.boldchat.com&quot; title=&quot;Visitor Monitoring&quot; target=&quot;_blank&quot;>&lt;img alt=&quot;Visitor Monitoring&quot; src=&quot;https://vms.boldchat.com/aid/789546764707432031/bc.vmi&quot; border=&quot;0&quot; width=&quot;1&quot; height=&quot;1&quot; />&lt;/a>







	



Issue Transactions


Search Transactions



Required fields are highlighted with an asterisk. 
	On-Line Personal Check Debit
			
			
			

			
				
				
				
				
	

Remittance ID:						
	
	
		
		
NoConveni080721085020Ahm
	

	



						


	
		
	
	
	




	
	First Name on Check:*		
		
		

	

	
	



	
					Last Name on Check:*
												
	

	

	
						
	
	

						
Address Line 1:*
						
												
		
	




		
	
	    Address Line 2:
	   
	   
	   	

			
		
		
	


Country:*

		
		United States

		
	
	
		

		
	
	

ZIP Code:*		
 
													
		
		






City:*

	
	
		

	

						
State:*					
							

Select OneArmed Forces AmericasArmed Forces EuropeArmed Forces CanadaArmed Forces AfricaArmed Forces Middle EastAlaskaAlabamaArmed Forces PacificArkansasAmerican SamoaArizonaCaliforniaColoradoConnecticutDistrict of ColumbiaDelawareFloridaFederated States of MicronesiaGeorgiaGuamHawaiiIowaIdahoIllinoisIndianaKansasKentuckyLouisianaMassachusettsMarylandMaineMichiganMinnesotaMissouriNorthern Mariana IslandsMississippiMontanaNorth CarolinaNorth DakotaNebraskaNew HampshireNew JerseyNew MexicoNevadaNew YorkOhioOklahomaOregonPennsylvaniaPuerto RicoPalauRhode IslandSouth CarolinaSouth DakotaTennesseeTexasUtahVirginiaVirgin IslandsVermontWashingtonWisconsinWest VirginiaWyoming

	


	
					


Routing Transit Number:*					
																			
	
		
		 
		




  						

Account Number:*					
																			
		
		
					


	

	

	Account Type: 	
																		
		
		
					Checking
					Savings
					
		

	



 	
				
Std Entry Class: 
	
		
	
	TEL - Telephone-Initiated Entry

	WEB - Internet-Initiated Entry

	





	


		
	

Amount ($):*
	
		
	





	

    
Email Address: 


		





UDF1:
*



		
		
		
		
				
UDF2:



		
		
		
		
				














	


var xmlhttp_1 = false;
if (!xmlhttp_1 &amp;&amp; typeof XMLHttpRequest!='undefined') {
  try {
	xmlhttp_1 = new XMLHttpRequest();
   } catch (e) { 
	xmlhttp_1=false;
   }
} else {
  try {
	 xmlhttp_1 = new ActiveXObject(&quot;Msxml2.XMLHTTP&quot;);
  } catch (e) {
	 xmlhttp_1=false;
  }
}

function selectNumber(){
  var routingNumber = document.getElementById(&quot;routingNumber&quot;).value;
  var url= &quot;/admin/imtiazdemo/vpos/1773/AjaxAction/?searchType=select_routingNumber&amp;routingNumber=&quot;+routingNumber;
  try{
  	   xmlhttp_1.open(&quot;GET&quot;,url,true);//:XXXXAction.do
	   xmlhttp_1.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
	   xmlhttp_1.onreadystatechange = responseRoutingNumber;
	   xmlhttp_1.send(null);
  } catch(err) {
 	if(err.message == &quot;Component returned failure code: 0x804b000f [nsIXMLHttpRequest.setRequestHeader]&quot;) {
		   alert('Donot sumbit repeatly!');
		} else {
		   alert(err.message);
		}
  }
}

function responseRoutingNumber() {
	var routingName = document.getElementById(&quot;routingName&quot;); 
	if (xmlhttp_1.readyState == 4 || xmlhttp_1.readyState == &quot;complete&quot;) {
		var json = eval('(' + xmlhttp_1.responseText + ')');
		routingName.innerHTML = json.NAME;
	}
}

function change(obj){
	var strsel = obj.options[obj.selectedIndex].value;
	var country_label = document.getElementById(&quot;country_label&quot;); 
	var url= &quot;/admin/imtiazdemo/vpos/1773/AjaxAction/?searchType=select_states&amp;countryCode=&quot;+strsel;
	try {
	   xmlhttp_1.open(&quot;GET&quot;,url,true);//:XXXXAction.do
	   xmlhttp_1.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
	   xmlhttp_1.onreadystatechange = responseName;
	   xmlhttp_1.send(null);
	 }catch (err){
		if(err.message == &quot;Component returned failure code: 0x804b000f [nsIXMLHttpRequest.setRequestHeader]&quot;) {
		   alert('Donot sumbit repeatly!');
		} else {
		   alert(err.message);
		}
	}
}

function responseName () {
var tmpStr = &quot;&quot;;
var country_label = document.getElementById(&quot;country_label&quot;); 
var city_label = document.getElementById(&quot;city_label&quot;); 
var zip_label = document.getElementById(&quot;zip_lable&quot;); 
	if (xmlhttp_1.readyState == 4 || xmlhttp_1.readyState == &quot;complete&quot;) {
		var json = eval('(' + xmlhttp_1.responseText + ')');
		if(json.STATE_LEABLE == &quot;State&quot;) {
			 country_label.innerHTML=json.STATE_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
			 city_label.innerHTML=&quot;City&quot;+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		} else {
			country_label.innerHTML=json.STATE_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
			city_label.innerHTML=&quot;City&quot;+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		} 
		zip_label.innerHTML = json.ZIP_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		document.getElementById(&quot;zip_name&quot;).value = json.ZIP_LEABLE;
		if(json.DATA_FLAG == &quot;true&quot;) {
			document.getElementById(&quot;state_us&quot;).options.length=0; 
			document.getElementById(&quot;state_other&quot;).name=&quot;state_temp&quot;;
			document.getElementById(&quot;state_other&quot;).style.display = &quot;none&quot;;
			document.getElementById(&quot;state_us&quot;).name=&quot;state&quot;;
			document.getElementById(&quot;state_us&quot;).style.display = &quot;&quot;;
			document.getElementById(&quot;state_us&quot;).options.add(new Option(&quot;Select One&quot;,&quot;&quot;)); 
			for(var i=0;i&lt;(json.STATE_LIST).length;i++) {
				document.getElementById(&quot;state_us&quot;).options.add(new Option((json.STATE_LIST)[i].STATE_NAME,(json.STATE_LIST)[i].STATE_NAME)); 
			} 
		}else {
				document.getElementById(&quot;state_us&quot;).name=&quot;state_temp&quot;;
				document.getElementById(&quot;state_us&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;state_other&quot;).name=&quot;state&quot;;
				document.getElementById(&quot;state_other&quot;).style.display = &quot;&quot;;
			 }
	}
}

function getState(str){
	var country_label = document.getElementById(&quot;country_label&quot;); 
	var url= &quot;/admin/imtiazdemo/vpos/1773/AjaxAction/?searchType=select_states&amp;countryCode=&quot;+str;
	try {
	   xmlhttp_1.open(&quot;GET&quot;,url,true);//:XXXXAction.do
	   xmlhttp_1.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
	   xmlhttp_1.onreadystatechange = responseState;
	   xmlhttp_1.send(null);
	 }catch (err){
		if(err.message == &quot;Component returned failure code: 0x804b000f [nsIXMLHttpRequest.setRequestHeader]&quot;) {
		   alert('Donot sumbit repeatly!');
		} else {
		   alert(err.message);
		}
	}
}
var sc_response_state=&quot;&quot;;
function responseState () {
var tmpStr = &quot;&quot;;
	var country_label = document.getElementById(&quot;country_label&quot;); 
	var city_label = document.getElementById(&quot;city_label&quot;); 
	var zip_label = document.getElementById(&quot;zip_lable&quot;); 
	if (xmlhttp_1.readyState == 4 || xmlhttp_1.readyState == &quot;complete&quot;) {
		var json = eval('(' + xmlhttp_1.responseText + ')');
		if(json.STATE_LEABLE == &quot;State&quot;) {
			 country_label.innerHTML=json.STATE_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
			 city_label.innerHTML=&quot;City&quot;+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		} else {
			country_label.innerHTML=json.STATE_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
			city_label.innerHTML=&quot;City&quot;+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		} 
		zip_label.innerHTML = json.ZIP_LEABLE+&quot;:&quot;+&quot;&lt;span class=\&quot;required\&quot;>*&lt;/span>&quot;;
		document.getElementById(&quot;zip_name&quot;).value = json.ZIP_LEABLE;
		if(json.DATA_FLAG == &quot;true&quot;) {
			document.getElementById(&quot;state_us&quot;).options.length=0; 
			document.getElementById(&quot;state_other&quot;).name=&quot;state_temp&quot;;
			document.getElementById(&quot;state_other&quot;).style.display = &quot;none&quot;;
			document.getElementById(&quot;state_us&quot;).name=&quot;state&quot;;
			document.getElementById(&quot;state_us&quot;).style.display = &quot;&quot;;
			document.getElementById(&quot;state_us&quot;).options.add(new Option(&quot;Select One&quot;,&quot;&quot;)); 
			for(var i=0;i&lt;(json.STATE_LIST).length;i++) {
				document.getElementById(&quot;state_us&quot;).options.add(new Option((json.STATE_LIST)[i].STATE_NAME,(json.STATE_LIST)[i].STATE_NAME)); 
			}
			
					document.getElementById(&quot;state_us&quot;).value = sc_response_state;
			
		}else {
				document.getElementById(&quot;state_us&quot;).name=&quot;state_temp&quot;;
				document.getElementById(&quot;state_us&quot;).style.display = &quot;none&quot;;
				document.getElementById(&quot;state_other&quot;).name=&quot;state&quot;;
				document.getElementById(&quot;state_other&quot;).style.display = &quot;&quot;;
		}
	}
}


function search_sc() {
	var sc_zip = document.getElementById(&quot;zip&quot;).value;
	var sc_countryCode =  document.getElementById(&quot;countryCode&quot;).value;
	var zip_name = document.getElementById(&quot;zip_name&quot;).value;
	var url= &quot;&quot;;
if(sc_zip != &quot;&quot;) {
		url= &quot;/admin/imtiazdemo/vpos/1773/AjaxAction/?searchType=select_state_city&amp;zipcode=&quot;+sc_zip+&quot;&amp;countryCode=&quot;+sc_countryCode+&quot;&amp;zipname=&quot;+zip_name;
	} else {
		url= &quot;/admin/imtiazdemo/vpos/1773/AjaxAction/?searchType=select_state_city&amp;countryCode=&quot;+sc_countryCode+&quot;&amp;zipname=&quot;+zip_name;
	}
	try {
	   xmlhttp_1.open(&quot;GET&quot;,url,true);//:XXXXAction.do
	   xmlhttp_1.setRequestHeader(&quot;Content-Type&quot;,&quot;application/x-www-form-urlencoded&quot;);
	   xmlhttp_1.onreadystatechange = responseSC;
	   xmlhttp_1.send(null);
	 }catch (err){
		if(err.message == &quot;Component returned failure code: 0x804b000f [nsIXMLHttpRequest.setRequestHeader]&quot;) {
		   alert('Donot sumbit repeatly!');
		} else {
		   alert(err.message);
		}
	 }
}

function responseSC() {
	if (xmlhttp_1.readyState == 4 || xmlhttp_1.readyState == &quot;complete&quot;) {
		var json = eval('[' + xmlhttp_1.responseText + ']');
		if(json[0].jsonflag) {
			document.getElementById(&quot;city&quot;).value=json[0].city;
			sc_response_state = json[0].stateName;
			getState(json[0].countryId);
			document.getElementById(&quot;error_zip&quot;).innerHTML=&quot;&quot;;
		}else {
			if(json[0].errorMessage != null) {
				document.getElementById(&quot;error_zip&quot;).innerHTML=json[0].errorMessage+&quot;&lt;br/>&quot;;
			} else {
				document.getElementById(&quot;error_zip&quot;).innerHTML=&quot;&quot;;
			}
		}
	}
}



	var defaultCountry_temp = 840;
	var country_code_JS = null;
	if(country_code_JS != null &amp;&amp; country_code_JS != &quot;&quot;) {
		getState(country_code_JS);
		document.getElementById(&quot;countryCode&quot;).value = country_code_JS;
	} else {
		getState(defaultCountry_temp);
	}


$(document).ready( function() {
	$(&quot;input[name='smsNumber']&quot;).inputmask(&quot;mask&quot;, { &quot;mask&quot;: &quot;999-999-9999&quot;, &quot;placeholder&quot;: &quot;###-###-####&quot;});
	
});



</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;contentwrapper&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='contentwrapper']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='wrapper']/div[2]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='User Management'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Dashboard'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]</value>
   </webElementXpaths>
</WebElementEntity>
