Em "C:\xampp\htdocs" executar: "git clone https://github.com/JonatasRodriguesReis/QSmartCost"

cd QSmartCost

composer install

Acessar "http://localhost/QsmartCost/frontend/web/"
Se der erro copiar copiar a pasta bower presente em "C:\xampp\htdocs\QSmartCost\vendor\yidas\yii2-bower-asset" para "C:\xampp\htdocs\QSmartCost\vendor"
(pasta bower dentro de pasta vendor)

Adicionar o seguinte código em "C:\xampp\htdocs\smartTecnico\frontend\views\layouts\left.php"

------------------------------------------------Código-----------------------------------------------------------------

['label' => 'Field Installation', 'icon' => 'fa fa-check-square-o', 'url' => ['/appinstalacao/index']],

----------------------------------------------------------------------------------------------------------

criar a seguinte tabela na database "yii2advanced":

----------------------------------------------------------------------------------------------------------

CREATE TABLE IF NOT EXISTS appinstalacao (
    id INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
)

----------------------------------------------------------------------------------------------------------

Clicar em executar(canto inferir direito)

Acessar "http://localhost/QsmartCost/frontend/web/index.php?r=gii"

clicar no start de model generator e preencher
Tablename = appinstalacao
Model Class Name = Appinstalacao
clicar em preview e em seguida em generate

clicar em CRUD generator e preencher

Model class = app\models\Appinstalacao

Controller Class = app\controllers\AppinstalacaoController

View Path = @app/views/appinstalacao

clicar em preview e em seguida em generate

Adicionar o seguinte código na linha seguinte a "namespace app\controllers;" em "C:\xampp\htdocs\QSmartCost/frontend/controllers/AppinstalacaoController.php"

---------------------------------------------------------Código---------------------------------------------------------------

namespace frontend\controllers;

------------------------------------------------------------------------------------------------------------


****************************************************************************************************************************************
Copiar "C:\xampp\htdocs\smartTecnico\frontend\views\appinstalacao\index.php" para "C:\xampp\htdocs\QSmartCost\frontend\views\appinstalacao" e substituir



