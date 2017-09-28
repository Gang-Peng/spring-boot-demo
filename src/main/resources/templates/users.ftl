<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>All Users</title>
    </head>
    <body>
        <h2>Users</h2>
        <table >
            <tr>
                <th>id</th> <th>name</th> <th>age</th> <th>sex</th>
            </tr>
        <#list users as user>
            <tr>
                <td>${user.id}</td> <td>${user.name}</td> <td>${user.age}</td> <td>${user.sex}</td>
            </tr>
        </#list>
        </table>
    </body>
</html>