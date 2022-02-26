let x, y, r;

document.addEventListener("DOMContentLoaded", function () {
    $('.hidden-textR input[type=hidden]').val(1.00);
    $('.x-button1').click();
    document.querySelector('input[name="form:textY"]').value = "0.0";
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
    x = $('.input-hidden-x input[type=hidden]').val();
    y = $('.input-y').val();
    drawHitPoint(x, y, r);
});

function refreshCanvas(event, ui) {
    clearCanvas();
    r = ui.value;
    drawCanvas(r);
}

