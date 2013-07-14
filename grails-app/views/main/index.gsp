<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Main page</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>Time</th>
            <th>Job name</th>
            <th>Trigger name</th>
        </tr>
        </thead>
        <tbody>
            <g:each var="action" in="${actions}">
                <tr>
                    <td><g:formatDate date="${action.dateCreated}" format="yyyy-MM-dd HH:mm:ss.SSS"/></td>
                    <td>${action.jobName?.encodeAsHTML()}</td>
                    <td>${action.triggerName?.encodeAsHTML()}</td>
                </tr>
            </g:each>
        </tbody>
    </table>
</body>
</html>