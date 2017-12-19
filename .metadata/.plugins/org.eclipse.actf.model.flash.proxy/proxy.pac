var NO_PROXY = "";

function FindProxyForURL(url, host) {
  if( url.substring(0,5) == "http:" ) {
    if( NO_PROXY.length > 0 && url.indexOf("?") == -1 ) {
	  var extPos = url.lastIndexOf(".");
	  if( extPos != -1 ) {
	    if( NO_PROXY.indexOf("|"+url.substring(extPos+1).toLowerCase()+"|") != -1 ) {
	      return "DIRECT";
	    }
	  }
    }
    return "PROXY localhost:57263; DIRECT";
  }
  if( url.substring(0,6) == "https:" ) {
    return "DIRECT";
  }
  if( url.substring(0,4) == "ftp:" ) {
    return "DIRECT";
  }
  if( url.substring(0,7) == "gopher:" ) {
    return "DIRECT";
  }
  return "DIRECT";
}
