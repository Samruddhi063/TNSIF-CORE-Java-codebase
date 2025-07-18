const menuItems = document.querySelectorAll('.menu li');
const sections = document.querySelectorAll('.content-section');

menuItems.forEach(item => {
  item.addEventListener('click', () => {
    menuItems.forEach(el => el.classList.remove('active'));
    sections.forEach(sec => sec.classList.remove('active'));

    item.classList.add('active');
    const section = document.getElementById(item.dataset.section);
    section.classList.add('active');
  });
});
