

with ((window && window.console && window.console._commandLineAPI) || {}) {
    (function () {

        var _z = console;
        Object.defineProperty(window, "console", {
            get: function () {
                if (_z._commandLineAPI) {
                    throw "Script execution not permitted";
                }
                return _z;
            },
            set: function (val) {
                _z = val;
            }
        });

    })();

    (function () {
        try {
            var $_console$$ = console;
            Object.defineProperty(window, "console", {
                get: function () {
                    if ($_console$$._commandLineAPI)
                        throw "Sorry, for security reasons, the script console is deactivated on netflix.com";
                    return $_console$$;
                },
                set: function ($val$$) {
                    $_console$$ = $val$$;
                }
            });
        } catch ($ignore$$) {
        }
    })();

    if (window.URL) {
        var ish, _call = Function.prototype.call;
        Function.prototype.call = function () {
            if (arguments.length > 0 && this.name === "evaluate" && arguments [0].constructor.name === "InjectedScriptHost") {
                ish = arguments[0];
                ish.evaluate = function (e) {
                    throw new Error('Rejected evaluation of: \n\'' + e.split('\n').slice(1, -1).join("\n") + '\'');
                };
                Function.prototype.call = _call;
                return _call.apply(this, arguments);
            }
        };
    }
    window.console.log = function () {
        console.error('Sorry , developers tools are blocked here....');
        window.console.log = function () {
            return false;
        };
    };

}
