function getHref(target) {
  if (!target.href) {
    return target.parentElement.href;
  }
  return target.href;
}

function handleOutboundLinkClicks(event) {
  ga('send', {
    hitType: 'event',
    eventCategory: 'Outbound Link',
    eventAction: 'click',
    eventLabel: getHref(event.target),
    transport: 'beacon'
  });
}

function main() {
  var links = document.getElementsByTagName('a');
  links = Array.prototype.slice.apply(links);
  links.forEach(function (link) {
    link.addEventListener('click', handleOutboundLinkClicks);
  });
}

(function () {
  main();
})();
