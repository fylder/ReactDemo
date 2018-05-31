'use strict';
    import React from 'react';
    import {
      AppRegistry,
      StyleSheet,
      Text,
      View
    } from 'react-native';
    class Say extends React.Component {
      render() {
        return (
          <View style={styles.container}>
            <Text style={styles.ahh}>hei,this is a react pager</Text>
          </View>
        )
      }
    }
    var styles = StyleSheet.create({
      container: {
        flex: 1,
        justifyContent: 'center',
      },
      ahh: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
      },
    });
    AppRegistry.registerComponent('fylder', () => Say);