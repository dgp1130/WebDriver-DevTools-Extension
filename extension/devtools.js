chrome.devtools.panels.create(
    'Extension Panel', // Name
    undefined, // Icon
    '/panel.html', // Path
    () => console.log('Loaded panel!'), // Callback
);
