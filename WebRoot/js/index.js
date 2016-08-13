function resize() {
    var clientWidth = document.documentElement.clientWidth;
    var allUsersInfor = document.querySelectorAll('.all-users-list');
    var allFilesInfor = document.querySelectorAll('.all-files-list');

    for (var i = 0; i < allUsersInfor.length; i++) {
        allUsersInfor[i].style.width = clientWidth - 350 + 'px';
    }
    for (var i = 0; i < allFilesInfor.length; i++) {
        allFilesInfor[i].style.width = clientWidth - 350 + 'px';
    }
}
window.addEventListener('resize', resize);
resize();

document.querySelector('.user-lists').addEventListener('click', function (ev) {
    changePages (ev);
}, false);

var preIndex = -1;
function changePages (ev) {

    function showPage (ele, data, sync) {
        ele.dataset.btn = data;
        var conClass = ele.parentNode.className + '-infor';
        document.querySelector('.' + conClass).style.display = sync;
        if (sync === 'block') {
            var con = document.querySelector('.' + conClass);
            con.style.animation = 'change 1s';
        } else {
            
        }
    }

    var btns = document.querySelectorAll('.text');

    btns = Array.prototype.slice.call(btns);
    btns = btns.slice(0, 2);
    var target = target || ev.target;
    if (target.dataset.btn === 'showInfor') {

        showPage(target, 'hidInfor', 'block');

        showPage(btns[preIndex], 'showInfor', 'none');

        preIndex = btns.indexOf(target);

    }
}

document.querySelector('.up-files').addEventListener('click', function() {
    document.querySelector('.up-files-back').style.display = 'block';
});
document.querySelector('#closeBtn').addEventListener('click', function() {
    document.querySelector('.up-files-back').classList.add('closed');
    setTimeout(function () {
        document.querySelector('.up-files-back').classList.add('closed');
        document.querySelector('.up-files-back').style.display = 'none';
    }, 1000);
});
