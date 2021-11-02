require linphone-sdk.inc

inherit gitpkgv

PR = "${INC_PR}.0"

# based on 5.0.27
SRCREV = "9e732013075c578fa4d54b4e535757af196212d7"

# TODO set SRCREV to a fixed stable version after merge of yocto-sumo branch

# For visualisation
python () {
    print("")
    print("linphone-sdk")
    print(d.getVar('SRCREV', True))
}

SRC_URI  = "gitsm://gitlab.linphone.org/BC/public/linphone-sdk.git;protocol=https;branch=release/5.0;"
SRC_URI += "file://call-stats.patch"

PV = "git_${SRCREV}"
PKGV = "${GITPKGVTAG}"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=ff3103b5db8ba4e2c66c511b7a73e407"
