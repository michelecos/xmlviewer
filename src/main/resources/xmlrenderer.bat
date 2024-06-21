@echo off
for /f "tokens=*" %%i in ('where java') do set output=%%i
echo uso java in %output%
echo %* > xmlrenderer.log
"C:\Program Files\OpenLogic\jre-21.0.3.1-hotspot\bin\java.exe" -jar xmlrenderer-1.0-SNAPSHOT-jar-with-dependencies.jar %2 %3 %4 %5