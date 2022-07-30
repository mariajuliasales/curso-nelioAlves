document.querySelector('#root').innerHTML = `
<section class="text">
Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab! Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab! Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab! Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab! Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab!Lorem ipsum dolor sit amet consectetur adipisicing elit. Quod doloremque error doloribus dolorum aliquid quaerat odit, temporibus debitis commodi officia aut iste ut vero nulla hic neque repellat possimus ab!
</section>
<button></button>
`
function scrollTop() {
  window.scrollTo({
    top: 0,
    behavior: 'smooth'
  })
}

function exibirOcultarButton() {
  if (window.scrollY === 0) {
    document.querySelector('button').style.display = 'none'
  } else {
    document.querySelector('button').style.display = 'block'
  }
}

document.querySelector('button').addEventListener('click', scrollTop)

window.addEventListener('scroll', exibirOcultarButton)
