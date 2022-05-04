$(function () {
    $('.main_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 1000,
        vertical: true,
        dots: true,
    });

    $('.mopen').on('click', function () {
        $('.gmb').toggleClass('on')
    })
})