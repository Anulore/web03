//$('.input-hidden-x input[type=hidden]').val(undefined);
let x, y, r;

let fieldX = document.getElementById("fieldX");
let fieldY = document.getElementById("fieldY");

document.querySelector('input[name="form:textY"]').value = "";

document.addEventListener("DOMContentLoaded", function () {
    $('.hidden-textR input[type=hidden]').val(1.00);
    $('.outputR').textContent = "1";
    drawCanvas(parseFloat($('.hidden-textR input[type=hidden]').val()));
});

$('.input-button-x').on('click', function (event) {
    $(this).addClass('pressed-x');
    $('.input-button-x').not(this).removeClass('pressed-x');
});

function changeX(link, val) {
    x = val;
    $('.input-hidden-x input[type=hidden]').val(x);
}

$('.send').on('click', function (event) {

    drawHitPoint(x, y, r);
    /*
    fieldX.textContent = "";
    fieldY.textContent = "";
    if(!(checkY())) {
        event.preventDefault();
        return;
    }
    */
    //$('.input-hidden-x input[type=hidden]').val('');
});
/*
function checkX () {
    let result = false;

    if ($('.input-hidden-x input[type=hidden]').val() != '') {
        result = true;
    }
    if (!result)
        fieldX.textContent = "Значение X должно быть выбрано!";
    return result;
}

function checkY() {
    y = $('.input-y').val();
    if (y.trim() === "") {
        fieldY.textContent = "Поле Y должно быть заполнено!";
        return false;
    }
    y = y.trim();
    y = y.substring(0, 10).replace(',', '.');
    if (!(y && !isNaN(y))) {
        fieldY.textContent = "Y должен быть числом!";
        return false;
    }
    if (y < -3 || y > 5) {
        fieldY.textContent = "Y должен принадлежать промежутку: [-3; 5]!";
        return false;
    }
    fieldY.textContent = '';
    return true;
}
*/
function refreshCanvas(event, ui) {
    clearCanvas();
    r = ui.value;
    drawCanvas(r);
}

