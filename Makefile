shell := sh

build:
	lein clean
	lein cljsbuild once
	lein garden once
