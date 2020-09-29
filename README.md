# WebDriver DevTools Extension

This attempts to use WebDriver to access a Chrome extension loaded in the
DevTools panel. This is necessary because DevTools panels have special APIs to
interact with the underlying page, such as accessing the network requests made.
These APIs cannot be easily simulated on a plain HTML page.

## Results

I tried hacking WebDriver to use the new `Driver#getDevTools()` method in 4.0,
but this doesn't appear to do what I want it to. Instead, it seems to refer to
"Chrome DevTools Protocol (CDP)". I was able to open DevTools but failed to
actually interact with it in any way.

## Alternatives

If you want to run an end-to-end test on a Chrome DevTools panel, I think your
best option right now would be to use
[Puppeteer](https://github.com/puppeteer/puppeteer) and hack a reference to the
extension frame. See
[this issue](https://github.com/puppeteer/puppeteer/issues/4247) for more info.
