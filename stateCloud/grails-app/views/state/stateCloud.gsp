
<html>
    <head>
        <meta name="layout" content="main">
        <title>State Cloud</title>
    </head>
    <body>
      <g:if test="${zips.isEmpty()}">none</g:if>
      <g:else>
        <g:each var="zip" in="${zips}">
          name: ${zip.name}, number of zips: ${zip.numberOfZips}  
        </g:each>
      </g:else>
    </body>
</html>
