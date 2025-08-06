<%--
  Created by IntelliJ IDEA.
  User: bmd tech
  Date: 05/08/2025
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Bienvenue sur le Web Service SOAP</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            padding: 40px;
        }

        .container {
            background-color: white;
            border-radius: 8px;
            padding: 30px;
            box-shadow: 0 0 15px rgba(0,0,0,0.1);
            max-width: 700px;
            margin: auto;
        }

        h1 {
            color: #005a87;
            text-align: center;
        }

        ul {
            margin-top: 20px;
        }

        li {
            margin-bottom: 10px;
        }

        a {
            color: #007acc;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        .footer {
            text-align: center;
            margin-top: 40px;
            font-size: 12px;
            color: #888;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>🧼 Bienvenue sur le Web Service SOAP</h1>
    <p>Ce projet expose deux services SOAP :</p>

    <ul>
        <li>
            📚 <strong>Service Classe</strong> :
            <a href="classe?wsdl" target="_blank">WSDL → /classe?wsdl</a>
        </li>
        <li>
            🏷️ <strong>Service Secteur</strong> :
            <a href="sector?wsdl" target="_blank">WSDL → /sector?wsdl</a>
        </li>
    </ul>

    <p>Utilisez SoapUI ou tout autre outil compatible SOAP pour tester les opérations exposées.</p>

    <div class="footer">
        Projet développé par Mouhamed NDIAYE — 2025
    </div>
</div>

</body>
</html>
