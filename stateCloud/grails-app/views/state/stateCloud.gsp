
<html>
    <head>
        <meta name="layout" content="main">
        <title>State Cloud</title>
    </head>
    <body>
      <g:if test="${!zips}">none</g:if>
      <g:else>
        <g:each var="zip" in="${zips}">
          ${zip.zip}
        </g:each>
      </g:else>
    </body>
</html>
